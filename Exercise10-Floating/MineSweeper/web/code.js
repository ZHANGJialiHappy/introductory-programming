let rows = 10;
let cols = 10;
let table = "<table>";

for (let r = 1 ; r <= rows ; ++r) {
    table += '<tr>'
    for (let c = 1 ; c <= cols ; ++c) {
        table += '<td>' + r * c + '</td>'
    }
    table += "</tr>"
}

table += '</table>'

document.getElementById("tablegoeshere").innerHTML = table;
