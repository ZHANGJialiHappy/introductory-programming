// An object with a single field (course) and one method (getName):

a = { "course" : "Introduction to Programming" }
a.getName = function() { return "Course name: " + this.course; }

// Calling the method and inserting the result into the document:

document.getElementById("place-for-text").innerHTML = a.getName()
