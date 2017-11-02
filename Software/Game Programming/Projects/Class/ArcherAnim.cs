using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class ArcherAnim : MonoBehaviour {

    Animator anim;
	// Use this for initialization
	void Start () {
        anim = GetComponent<Animator>();
	}
	
	// Update is called once per frame
	void Update () {
        if (Input.GetKeyDown(KeyCode.W))
        {
            anim.SetBool("IsAttack", true);
        }
	}
}
