

 function submit123() {
                let nameElement=document.getElementById("name");
                let name=nameElement.value;
                let emailElement=document.getElementById("email");
                let email=emailElement.value;
             let passworde=document.getElementById("password");
             let pass=passworde.value;
                
                
                
                let flag=true;
                 if(name.length==0){
                    alert("enter name")
                    flag=false;
                 }
                 else if(email.length==0){
                    alert("enter email")
                    flag=false;

                 }
                 else if(pass.length==0){
					 alert("enter password")
                    flag=false;
				 }
				
                
                 return flag;
            }
    
