using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class CubeRotation : MonoBehaviour {

	// Use this for initialization
	void Start () {
		
	}
	
	// Update is called once per frame
	void Update () {
        // Time.deltaTime is the frame interval time
        transform.Rotate(0, 90 * Time.deltaTime, 0);
	}
}
