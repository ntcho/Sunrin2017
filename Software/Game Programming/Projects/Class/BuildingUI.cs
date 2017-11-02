using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class BuildingUI : MonoBehaviour {

    ParentBuilding Building;

	// Use this for initialization
	void Start () {
        Building = GameObject.Find("Archery_Range_1B").GetComponent<UnitRange>();
	}

    public void Click1()
    {
        Building.Button1Click();
    }
    public void ButtonBuilding1()
    {
        Invoke("Click1", Building.CreateTime1);
    }
    public void Click2()
    {
        Building.Button2Click();
    }
    public void ButtonBuilding2()
    {
        Invoke("Click2", Building.CreateTime2);
    }

    // Update is called once per frame
    void Update () {
        if (Input.GetMouseButtonDown(0))
        {
            Ray MouseRay = Camera.main.ScreenPointToRay(Input.mousePosition);
            RaycastHit hit;
            if (Physics.Raycast(MouseRay, out hit, 1000.0f, 1 << LayerMask.NameToLayer("Building")))
            {
                Building = hit.collider.transform.GetComponent<UnitRange>();
            }
        }
    }
}
