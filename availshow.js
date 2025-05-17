// Helper function to create and append table rows
function appendRow(table, values) {
    const row = table.insertRow();
    values.forEach(value => {
        const cell = row.insertCell();
        cell.textContent = value;
    });
}

function showCourses() {
    fetch("http://localhost:8080/courses")
        .then(response => {
            if (!response.ok) throw new Error("Failed to fetch courses");
            return response.json();
        })
        .then(courses => {
            const dataTable = document.getElementById("coursetable");
            courses.forEach(course => {
                appendRow(dataTable, [
                    course.courseId,
                    course.courseName,
                    course.trainer,
                    course.durationInWeeks
                ]);
            });
        })
        .catch(error => {
            console.error("Error loading courses:", error);
            alert("Failed to load courses.");
        });
}

function showEnrolledStudents() {
    fetch("http://localhost:8080/courses/enrolled")
        .then(response => {
            if (!response.ok) throw new Error("Failed to fetch enrolled students");
            return response.json();
        })
        .then(students => {
            const dataTable = document.getElementById("EnrolledStudents");
            students.forEach(student => {
                appendRow(dataTable, [
                    student.name,
                    student.emailId,
                    student.courseName
                ]);
            });
        })
        .catch(error => {
            console.error("Error loading enrolled students:", error);
            alert("Failed to load enrolled students.");
        });
}
