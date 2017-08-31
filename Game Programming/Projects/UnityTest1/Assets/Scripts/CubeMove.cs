using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class CubeMove : MonoBehaviour {

	// Use this for initialization
	void Start () {
		
	}

    float Dir = 0.2f;
	
	// Update is called once per frame
	void Update () {
        // this prints the position of the cube object
        //print(GetComponent<Transform>().position);
        transform.position = transform.position + new Vector3(Dir, 0, 0);

        // calculate the time between frame and frame

        if (transform.position.x > 5)
        {
            Dir = -0.2f;
        }
        if (transform.position.x < -5)
        {
            Dir = 0.2f;
        }
	}
}
