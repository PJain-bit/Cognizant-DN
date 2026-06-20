// ======================================
// JavaScript Basics
// ======================================

console.log("Welcome to the Community Portal");

window.onload = function () {

    alert("Page Fully Loaded");

    displayEvents();

    loadPreference();
};

// ======================================
// Event Data
// ======================================

const eventName = "Music Festival";

const eventDate = "20 June 2026";

let totalRegistrations = 0;

console.log(
    `Event: ${eventName}
     Date: ${eventDate}`
);

// ======================================
// Event Class
// ======================================

class Event {

    constructor(name, category, seats) {

        this.name = name;
        this.category = category;
        this.seats = seats;
    }
}

// ======================================
// Prototype Method
// ======================================

Event.prototype.checkAvailability =
    function () {

        return this.seats > 0;
    };

// ======================================
// Event Array
// ======================================

let events = [

    new Event(
        "Music Night",
        "Music",
        10
    ),

    new Event(
        "Food Carnival",
        "Food",
        5
    ),

    new Event(
        "Tech Seminar",
        "Tech",
        15
    )
];

// ======================================
// Display Events
// ======================================

function displayEvents(
    filteredEvents = events
) {

    const container =
        document.querySelector(
            "#eventContainer"
        );

    container.innerHTML = "";

    filteredEvents.forEach(event => {

        if (event.seats <= 0) {

            return;
        }

        const card =
            document.createElement("div");

        // Bootstrap Responsive Columns

        card.classList.add(
            "col-md-4"
        );

        card.innerHTML = `

        <div class="card shadow h-100">

            <div class="card-body">

                <h3 class="card-title">
                    ${event.name}
                </h3>

                <p class="card-text">

                    Category:
                    ${event.category}

                </p>

                <p class="card-text">

                    Seats:
                    ${event.seats}

                </p>

                <button
                    class="btn btn-primary"
                    onclick="registerUser('${event.name}')">

                    Register

                </button>

            </div>

        </div>
        `;

        container.appendChild(card);
    });
}

// ======================================
// Register User
// ======================================

function registerUser(eventName) {

    try {

        let event =
            events.find(
                e => e.name === eventName
            );

        if (!event.checkAvailability()) {

            throw new Error(
                "No Seats Available"
            );
        }

        event.seats--;

        totalRegistrations++;

        alert(
            `Registered for ${event.name}`
        );

        displayEvents();

    } catch (error) {

        console.log(error.message);

        alert(error.message);
    }
}

// ======================================
// Add Event
// ======================================

function addEvent(
    name,
    category,
    seats = 20
) {

    events.push(
        new Event(
            name,
            category,
            seats
        )
    );

    displayEvents();
}

// ======================================
// Filter Events
// ======================================

function filterEventsByCategory() {

    const selectedCategory =
        document.getElementById(
            "categoryFilter"
        ).value;

    localStorage.setItem(
        "preferredCategory",
        selectedCategory
    );

    if (selectedCategory === "All") {

        displayEvents();

        return;
    }

    const filtered =
        events.filter(
            event =>
                event.category ===
                selectedCategory
        );

    displayEvents(filtered);
}

// ======================================
// Load Preference
// ======================================

function loadPreference() {

    const saved =
        localStorage.getItem(
            "preferredCategory"
        );

    if (saved) {

        document.getElementById(
            "categoryFilter"
        ).value = saved;

        filterEventsByCategory();
    }
}

// ======================================
// Search Events
// ======================================

document
    .getElementById("searchBox")

    .addEventListener(
        "input",
        function () {

            const keyword =
                this.value.toLowerCase();

            const filtered =
                events.filter(
                    event =>
                        event.name
                        .toLowerCase()
                        .includes(keyword)
                );

            displayEvents(filtered);
        }
    );

// ======================================
// Category Change
// ======================================

document
    .getElementById(
        "categoryFilter"
    )

    .addEventListener(
        "change",
        filterEventsByCategory
    );

// ======================================
// Form Handling
// ======================================

document
    .getElementById(
        "registrationForm"
    )

    .addEventListener(
        "submit",
        async function (event) {

            event.preventDefault();

            const form = event.target;

            const name =
                document.getElementById(
                    "name"
                ).value;

            const email =
                document.getElementById(
                    "email"
                ).value;

            let valid = true;

            // Clear Previous Errors

            document.getElementById(
                "nameError"
            ).innerHTML = "";

            document.getElementById(
                "emailError"
            ).innerHTML = "";

            // Validation

            if (name.trim() === "") {

                document.getElementById(
                    "nameError"
                ).innerHTML =
                "Name Required";

                valid = false;
            }

            if (!email.includes("@")) {

                document.getElementById(
                    "emailError"
                ).innerHTML =
                "Valid Email Required";

                valid = false;
            }

            if (!valid) return;

            document.getElementById(
                "successMessage"
            ).innerHTML =
            "Submitting...";

            try {

                await sendRegistration({
                    name,
                    email
                });

                document.getElementById(
                    "successMessage"
                ).innerHTML =
                "Registration Successful";

                form.reset();

            } catch {

                document.getElementById(
                    "successMessage"
                ).innerHTML =
                "Registration Failed";
            }
        }
    );

// ======================================
// Fetch API
// ======================================

function sendRegistration(data) {

    return new Promise(
        (resolve, reject) => {

            setTimeout(() => {

                fetch(
                    "https://jsonplaceholder.typicode.com/posts",
                    {
                        method: "POST",

                        headers: {
                            "Content-Type":
                            "application/json"
                        },

                        body:
                        JSON.stringify(data)
                    }
                )

                .then(response =>
                    response.json()
                )

                .then(data => {

                    console.log(data);

                    resolve(data);
                })

                .catch(error => {

                    console.log(error);

                    reject(error);
                });

            }, 2000);
        }
    );
}

// ======================================
// Object Entries
// ======================================

events.forEach(event => {

    console.log(
        Object.entries(event)
    );
});

// ======================================
// Destructuring
// ======================================

const [firstEvent] = events;

const {
    name,
    category
} = firstEvent;

console.log(name, category);

// ======================================
// Spread Operator
// ======================================

const clonedEvents = [...events];

console.log(clonedEvents);

// ======================================
// jQuery
// ======================================

$("#registerBtn").click(function () {

    $("#successMessage").fadeOut();

    $("#successMessage").fadeIn();
});

// ======================================
// Framework Benefit
// ======================================

console.log(
    "React/Vue provide reusable components and better UI management."
);