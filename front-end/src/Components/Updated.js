import React, { useState } from "react";

function Updated({ formInputs, setFormInputs,setView, setCurrentView  }) {
  

  
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
      <h1>Thank you for updating your account</h1>
      <h2>The details submitted are shown below, if there are any problems please contact us.</h2>
     <form id="createUser" onSubmit={submitHandler}>
      <p className="pRow">
       <label className="formCell">Name</label>
       <label className="formCell" >&nbsp;:&nbsp;{placeholder.fullname ? placeholder.fullname : "Not Updated"}</label>
      </p>
      <p className="pRow">
        <label className="formCell">Password</label>
        <label className="formCell" >&nbsp;:&nbsp;{placeholder.password ? "Updated" : "Not Updated"}</label>
      </p>
      <p className="pRow">
        <label className="formCell">email</label>
        <label className="formCell" >&nbsp;:&nbsp;{placeholder.email ? placeholder.email : "Not Updated"}</label>
      </p>
      <p className="pRow">
        <label className="formCell">Opening Reading</label>
        <label className="formCell" >&nbsp;:&nbsp;{placeholder.lastreading ? placeholder.lastreading : "Not Updated"}</label>
      </p>
      <p className="pRow">
        <label className="formCell">Mobile Number</label>
        <label className="formCell" >&nbsp;:&nbsp;{placeholder.phonenumber ? placeholder.phonenumber : "Not Updated"}</label>
      </p>
     </form>
     <p>      
      <button form="createUser" className="formCell" onClick={submitHandler}>Home</button>
     </p>
    </div>
  );
  
}

export default Updated;
