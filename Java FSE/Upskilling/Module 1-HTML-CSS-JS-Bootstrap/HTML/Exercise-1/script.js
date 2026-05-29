function showFee() {

    let fee =
        document.getElementById("eventType").value;

    document.getElementById("feeDisplay")
        .innerHTML = "Event Fee: ₹" + fee;

    localStorage.setItem("preferredEvent", fee);
}

function validatePhone() {

    let phone =
        document.getElementById("phone").value;

    if (phone.length != 10) {

        alert("Phone number must be 10 digits");
    }
}

function showConfirmation() {

    alert("Form submitted successfully!");
}

function enlargeImage() {

    let img =
        document.getElementById("zoomImage");

    img.style.width = "400px";
}

function countCharacters() {

    let text =
        document.getElementById("feedback").value;

    document.getElementById("charCount")
        .innerHTML =
        "Characters: " + text.length;
}

function videoReady() {

    document.getElementById("videoMessage")
        .innerHTML =
        "Video ready to play";
}

function showOutput(event) {

    event.preventDefault();

    document.getElementById("outputMessage")
        .innerHTML =
        "Registration Successful!";
}

window.onload = function () {

    let savedEvent =
        localStorage.getItem("preferredEvent");

    if (savedEvent) {

        document.getElementById("eventType")
            .value = savedEvent;
    }
}

function findLocation() {

    navigator.geolocation.getCurrentPosition(

        success,
        error,
        {
            enableHighAccuracy: true,
            timeout: 5000
        }
    );
}

function success(position) {

    document.getElementById("location")
        .innerHTML =
        "Latitude: " +
        position.coords.latitude +
        "<br>Longitude: " +
        position.coords.longitude;
}

function error() {

    alert("Unable to get location");
}

window.onbeforeunload = function () {

    return "Your form is not submitted!";
}