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
      <h1>Your request to delete your account has been recieved</h1>
            <h3>Confirmation will be sent via SMS Message</h3>
     
      <button form="createUser" className="formCell" onClick={submitHandler}>Home</button>

    </div>
  );
  
}

export default Created;
