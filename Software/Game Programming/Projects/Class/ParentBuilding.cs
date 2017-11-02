using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class ParentBuilding : MonoBehaviour {
    public Transform RegenTarget;
    public float CreateTime1 = 1.0f;
    public float CreateTime2 = 2.0f;

    public virtual void Button1Click() { }
    public virtual void Button2Click() { }
}
