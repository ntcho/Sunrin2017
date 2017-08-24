using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class PlayerController : MonoBehaviour
{

    private Rigidbody rb;
    // this variable could be changed in unity inspector window
    public float speed = 10;

    public Text countText;
    private int count;
    public Text finishText;

    // Use this for initialization
    void Start()
    {
        rb = GetComponent<Rigidbody>();
        count = 0;

        SetCountText();
    }

    // Update is called once per frame
    void FixedUpdate()
    {
        float moveHorizontal = Input.GetAxis("Horizontal");
        float moveVertical = Input.GetAxis("Vertical");

        Vector3 movement = new Vector3(moveHorizontal, 0.0f, moveVertical);
        rb.AddForce(movement * speed);
    }

    void OnTriggerEnter(Collider other)
    {
        if (other.gameObject.CompareTag("PickUp")) {
            other.gameObject.SetActive(false);

            // update count text
            count++;
            SetCountText();

            if (other.gameObject.activeInHierarchy == false)
            {
                // delay 1 sec and regenerate
                StartCoroutine(SetObjectActiveOnDelay(other.gameObject, 1));
            }
        }

        if (other.gameObject.CompareTag("PickUpFinal"))
        {
            if (count >= 2)
            {
                other.gameObject.SetActive(false);

                // update count text
            }
        }
    }

    IEnumerator SetObjectActiveOnDelay(GameObject obj, float seconds)
    {
        yield return new WaitForSeconds(seconds);
        obj.SetActive(true);
    }

    void SetCountText()
    {
        // update countText text
        countText.text = "Count: " + count.ToString();
    }

    void ShowFinished()
    {
        // show final
        finishText.gameObject.SetActive(true);
    }
}
