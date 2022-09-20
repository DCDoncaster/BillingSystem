import React, { useState } from "react";

function Create({ formInputs, setFormInputs,setView }) {
  

  
  const submitHandler = async (e) => {
    
    e.preventDefault();
    try {
      let response = await fetch(
        `http://localhost:8080/user/create`,
        {
          headers: {
            Accept: 'application/json',
            'Content-Type': 'application/json',
          },
          method: "POST",
          mode: "cors", 
          body: JSON.stringify(

            formInputs
            ),
        }
      );
      setView(1);
//Use this to display the account details once submitted
      const data = await response.json();
      // let newObj = {};

      // setFormInputs(newObj);
    } catch (err) {}
  };


  function onChangeHandler(e) {
    let formData = formInputs;
    formData[e.target.name] = e.target.value;
    formData.outstandingbalance = "0.0"
    setFormInputs(formData);
    console.log(formData);
  }

  return (
    <div className="centeredDiv">
      <h1>Create an Account</h1>
     <form id="createUser" onSubmit={submitHandler}>
      <p className="pRow">
        <label className="formCell">Full Name</label>
        <input className="formCell" name="fullname" type="text" placeholder="Your Full Name" value={formInputs.fullname} onChange={onChangeHandler}></input>
      </p>
      <p className="pRow">
        <label className="formCell">Set Password</label>
        <input className="formCell" name="password" type="password" placeholder="Set a Password" value={formInputs.password} onChange={onChangeHandler}></input>
      </p>
      <p className="pRow">
        <label className="formCell">email</label>
        <input className="formCell" name="email" type="text" placeholder="email@email.com" value={formInputs.email} onChange={onChangeHandler}></input>
      </p>
      <p className="pRow">
        <label className="formCell">Opening Reading</label>
        <input className="formCell" name="lastreading" type="text" placeholder="01234" value={formInputs.lastreading} onChange={onChangeHandler}></input>
      </p>
      <p className="pRow">
        <label className="formCell">Mobile Number</label>
        <input className="formCell" name="phonenumber" type="text" placeholder="07777 123 456" value={formInputs.phonenumber} onChange={onChangeHandler}></input>
      </p>
     </form>
     <p>
      
      <button form="createUser" className="formCell" onClick={submitHandler}>Submit</button>
     </p>
    </div>
  );
}

export default Create;
