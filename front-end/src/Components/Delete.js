import React, { useState } from "react";

function Delete({ formInputs, setFormInputs,setView }) {
  

  
  const submitHandler = async (e) => {
    
    e.preventDefault();
    try {
      let response = await fetch(
        `http://localhost:8080/user/delete/${formInputs.id}`,
        {
          headers: {
            Accept: 'application/json',
            'Content-Type': 'application/json',
          },
          method: "DELETE",
          mode: "cors", 
          body: JSON.stringify(

            formInputs
            ),
        }
      );
      setView(5);
//Use this to display the account details once submitted
      const data = await response.json();
      // let newObj = {};

      // setFormInputs(newObj);
    } catch (err) {}
  };


  function onChangeHandler(e) {
    let formData = formInputs;
    formData[e.target.name] = e.target.value;
    setFormInputs(formData);
  
  }

  return (
    <div className="centeredDiv">
      <h1>Delete your account:</h1>
      
     <form id="createUser" onSubmit={submitHandler}>
     <p className="pRow">
        <label className="formCell">Account ID</label>
        <input className="formCell" name="id" type="text" placeholder="Your Account Number" value={formInputs.id} onChange={onChangeHandler}></input>
      </p>
      <p className="pRow">
        <label className="formCell">Confirm Password</label>
        <input className="formCell" name="password" type="password" placeholder="Enter Password" value={formInputs.password} onChange={onChangeHandler}></input>
      </p>
      
     </form>
     <p>
      
      <button form="createUser" className="formCell" onClick={submitHandler}>Submit</button>
     </p>
    </div>
  );
}

export default Delete;
