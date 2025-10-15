// Login
document.getElementById("loginForm")?.addEventListener("submit", async function(e){
    e.preventDefault();
    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    const response = await fetch("http://localhost:8080/api/auth/login", {
        method: "POST",
        headers: {"Content-Type":"application/json"},
        body: JSON.stringify({username, password})
    });
    const result = await response.text();
    document.getElementById("loginMessage").textContent = result;
});

// Add Student
document.getElementById("studentForm")?.addEventListener("submit", async function(e){
    e.preventDefault();
    const name = document.getElementById("name").value;
    const rollNo = document.getElementById("rollNo").value;
    const studentClass = document.getElementById("class").value;
    const marks = parseInt(document.getElementById("marks").value);
    const attendance = parseInt(document.getElementById("attendance").value);

    const response = await fetch("http://localhost:8080/api/student/add", {
        method: "POST",
        headers: {"Content-Type":"application/json"},
        body: JSON.stringify({name, rollNo, studentClass, marks, attendance})
    });
    const result = await response.json();
    document.getElementById("studentMessage").textContent = `${result.name} added successfully!`;
});
