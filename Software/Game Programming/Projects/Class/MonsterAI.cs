using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.AI;

public class MonsterAI : MonoBehaviour {

    NavMeshAgent nav;
    public GameObject Target = null;
    public GameObject Path;

	// Use this for initialization
	void Start () {
        nav = GetComponent<NavMeshAgent>();
        // find in all objects search for name Paths
        Path = GameObject.Find("Paths");
        // finds the child object named Start
        Path = Path.transform.Find("Start").gameObject;

        StartCoroutine("Move");
	}

    IEnumerator Move()
    {
        while (true)
        {
            if (Target != null)
            {
                nav.SetDestination(Target.transform.position);
            }
            else
            {
                nav.SetDestination(Path.transform.position);
                if ((transform.position - Path.transform.position).magnitude < 1.0f)
                {
                    if (Path.name == "Start")
                    {
                        Path = Path.transform.parent.Find("0").gameObject;
                    }
                    else
                    {
                        int index = int.Parse(Path.name) + 1;
                        GameObject Tmp = Path.transform.parent.Find(index.ToString()).gameObject;
                        if (Tmp != null)
                        {
                            Path = Tmp;
                        }
                    }
                }
            }
            yield return null;
        }
    }

    // following two functions will repeat each other's work

    void OnTriggerStay(Collider other)
    {
        if (other.gameObject.layer == LayerMask.NameToLayer("PlayerUnit"))
        {
            if (Target == null)
            {
                Target = other.gameObject;
            }
        }
    }

    void OnTriggerExit(Collider other)
    {
        if (other.gameObject.layer == LayerMask.NameToLayer("PlayerUnit"))
        {
            if (Target == other.gameObject)
            {
                Target = null;
            }
        }
    }


    // Update is called once per frame
    void Update () {
		
	}
}
