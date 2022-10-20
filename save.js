const firebaseConfig = {
    apiKey: "AIzaSyB7hpR1n-JksiPqTG_nIZwArc4d0q2CPr8",
    authDomain: "registration-form-50c47.firebaseapp.com",
    databaseURL: "https://registration-form-50c47-default-rtdb.firebaseio.com",
    projectId: "registration-form-50c47",
    storageBucket: "registration-form-50c47.appspot.com",
    messagingSenderId: "592796188073",
    appId: "1:592796188073:web:16e08565993c4bbfd058b8"
  }; 

  // initialize firebase
  firebase.initializeApp(firebaseConfig);

 //reference your database
 var registrationFormDb= firebase.database().ref('RegistrationForm');

document.getElementById('RegistrationForm').addEventListener('submit',submitForm);

function submitForm(e){
    e.preventDefault();

    var name=getElementVal('name'); 
    var email=getElementVal('email');
    var contact=getElementVal('contact');
    var skills=getElementVal('skills');

    console.log(name,email,contact,skills);

    saveMessages(name,email,contact,skills);

}
const saveMessages=(name,email,contact,skills)=>{
    var newRegistrationForm=registrationFormDb.push();

    newRegistrationForm.set({
        name:name,
        email:email,
        contact:contact,
        skills:skills,
    })
};

const getElementVal=(id)=>{
    return document.getElementById(id).value;
};