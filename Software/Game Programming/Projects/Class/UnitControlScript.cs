using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public enum UnitControl { Move, Attack, Cancel, Patrol, None};

public class UnitControlScript : MonoBehaviour {

    UnitMove Target = null;
    UnitControl State = UnitControl.None;

    Ray MouseRay;
    RaycastHit hit;
    Vector3 Position;

	// Use this for initialization
	void Start () {
		
	}
	
	// Update is called once per frame
	void Update () {
        if (Input.GetMouseButtonDown(1))
        {
            MouseRay = Camera.main.ScreenPointToRay(Input.mousePosition);
            

            if (Physics.Raycast(MouseRay, out hit, 1000.0f, 1 << LayerMask.NameToLayer("PlayerUnit")))
            {
                Target = hit.collider.gameObject.GetComponent<UnitMove>();
            }
            else
            {
                Target = null;
            }
        }

        if (Input.GetMouseButtonDown(0))
        {
            if (Target != null)
            {
                if (State != UnitControl.None)
                {
                    MouseRay = Camera.main.ScreenPointToRay(Input.mousePosition);
                    if (Physics.Raycast(MouseRay, out hit, 1000.0f, 1 << LayerMask.NameToLayer("Default")))
                    {
                        Position = hit.point;
                    }

                    Target.isPatrol = false;
                    Target.isAttack = false;

                    switch (State)
                    {
                        case UnitControl.Move:
                            Target.targetPosition = Position;
                            break;
                        case UnitControl.Patrol:
                            // Position is the clicked position
                            Target.targetPosition = Position;
                            Target.beforePosition = Target.transform.position;
                            Target.isPatrol = true;
                            break;
                        case UnitControl.Attack:
                            // Position is the clicked position
                            Target.targetPosition = Position;
                            Target.isAttack = true;
                            break;
                    }
                }
            }
        }
	}

    public void ButtonMove()
    {
        State = UnitControl.Move;
    }
    public void ButtonAttack()
    {
        State = UnitControl.Attack;
    }
    public void ButtonPatrol()
    {
        State = UnitControl.Patrol;
    }
    public void ButtonCancel()
    {
        State = UnitControl.Cancel;
        Target.targetPosition = Target.transform.position;
        Target.isPatrol = false;
        Target.isAttack = false;
    }
}
