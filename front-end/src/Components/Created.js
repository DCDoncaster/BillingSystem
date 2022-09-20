import React, { useState } from "react";

function Created({ formInputs, setFormInputs,setView, setCurrentView  }) {
  

  
  const submitHandler = async (e) => {
    
    e.preventDefault();
    
      setView(0);
            let newObj = {};

      setFormInputs(newObj);
//Use this to display the account details once submitted
  

  
  };

let placeholder = formInputs;

  return (
    <div className="centeredDiv">
      <h1>Thank you for creating your account</h1>
      <h2>The details submitted are shown below, if there are any problems please contact us.</h2>
     <form id="createUser" onSubmit={submitHandler}>
      <p className="pRow">
        <label className="formCell">Full Name</label>
        
        <label className="formCell" >&nbsp;:&nbsp;{placeholder.fullname}</label>
        
      </p>
      <p className="pRow">
        <label className="formCell">email</label>
        <label className="formCell" >&nbsp;:&nbsp;{placeholder.email}</label>
      </p>
      <p className="pRow">
        <label className="formCell">Opening Reading</label>
        <label className="formCell" >&nbsp;:&nbsp;{placeholder.lastreading}</label>
      </p>
      <p className="pRow">
        <label className="formCell">Mobile Number</label>
        <label className="formCell" >&nbsp;:&nbsp;{placeholder.phonenumber}</label>
      </p>
     </form>
     <p>
      
      <button form="createUser" className="formCell" onClick={submitHandler}>Home</button>
     </p>
    </div>
  );
  
}

export default Created;
