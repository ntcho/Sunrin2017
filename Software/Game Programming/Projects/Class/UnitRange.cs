using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class UnitRange : ParentBuilding {

    public Transform UnitArcher;
    public Transform UnitSwordMan;
    

	// Use this for initialization
	void Start () {
        
	}

    public override void Button1Click()
    {
        Transform Unit = Instantiate(UnitArcher);
        Unit.position = RegenTarget.position;
        Unit.rotation = RegenTarget.rotation;
        Unit.name = UnitArcher.name;
    }
    public override void Button2Click()
    {
        Transform Unit = Instantiate(UnitSwordMan);
        Unit.position = RegenTarget.position;
        Unit.rotation = RegenTarget.rotation;
        Unit.name = UnitSwordMan.name;
    }

    // Update is called once per frame
    void Update () {
        
	}
}
