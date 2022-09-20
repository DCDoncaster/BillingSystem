import React from "react";


function NavBar ({setView, setCurrentView}){




    return(<div>
            <nav className="nav" >
                    <a href="/" className="site-title" >Billing System</a>
                <ul>
                        <li className='active'>
                        <p onClick={()=>{setView(0)}}>Create Account</p>               
                        </li>
                        <li>
                        <p onClick={()=>{setView(2)}}>Update Details</p>
                        </li>
                        <li>
                        <p onClick={()=>{setView(4)}}>Delete Account</p>
                        </li>
                    <div className='navBar-btn'>

                    </div>
                </ul>
            </nav> 
        </div>)
}



export default NavBar