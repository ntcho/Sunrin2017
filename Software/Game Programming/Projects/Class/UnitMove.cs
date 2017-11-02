using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.AI;

public class UnitMove : MonoBehaviour {

    public Vector3 targetPosition;
    public Vector3 beforePosition;
    public bool isPatrol;
    public bool isAttack = false;
    NavMeshAgent nav;

    GameObject Target = null;

	// Use this for initialization
	void Start () {
        nav = GetComponent<NavMeshAgent>();
	}
	
	// Update is called once per frame
	void Update () {
        if (Target == null)
        {
            nav.SetDestination(targetPosition);

            if ((targetPosition - transform.position).magnitude < 0.3f)
            {
                if (isPatrol)
                {
                    Vector3 tmp = targetPosition;
                    targetPosition = beforePosition;
                    beforePosition = tmp;
                }
            }
        }
        else
        {
            nav.SetDestination(Target.transform.position);
        }
	}

    void OnTriggerEnter(Collider other)
    {
        if (isAttack)
        {
            if (other.gameObject.layer == LayerMask.NameToLayer("Monster"))
            {
                Target = other.gameObject;
            }
        }
    }
}
