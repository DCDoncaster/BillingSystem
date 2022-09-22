import React, { useState } from "react";

function Login({ formInputs, setFormInputs,setView, loggedIn, setLoggedIn }) {
  

  
  const submitHandler = async (e) => {
    // console.log('banana')
    e.preventDefault();
    try {
    let response = await fetch(  `http://localhost:8080/user/read/${formInputs.id}`, {
    headers: {
      Accept: 'application/json',
      'Content-Type': 'application/json',
    },
    method: 'GET',
    mode: "cors", //added to allow to pass login
    
  }); 
  let data = await response.json()
     if (data.password === formInputs.password) {
        setLoggedIn(data);
§§        setView(2);
        setFormInputs({});
      }else{
        setLoggedIn({fullname: "Invalid Login"});
        setFormInputs({});
      }

    } catch (err) {}
  };


  function onChangeHandler(e) {
    let formData = formInputs;
    formData[e.target.name] = e.target.value;
    setFormInputs(formData);
    console.log(formInputs)
  }

  return (
    <div className="centeredDiv">
      <h1>Please enter your details below to login</h1>


     <form id="createUser" onSubmit={submitHandler}>
     <p className="pRow">
        <label className="formCell">Account Number</label>
        <input className="formCell" name="id" type="text" placeholder="Account Number" value={formInputs.id} onChange={onChangeHandler}></input>
      </p>
      <p className="pRow">
        <label className="formCell">Set Password</label>
        <input className="formCell" name="password" type="password" placeholder="Enter password a Password" value={formInputs.password} onChange={onChangeHandler}></input>
      </p>

     
     </form>
     <p>
      
      <button form="createUser" className="formCell" onClick={submitHandler}>Log In</button>
     </p>
    </div>
  );
}

export default Login;
