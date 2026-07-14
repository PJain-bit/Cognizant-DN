import CohortDetails from "./Components/CohortDetails";

function App() {

    const cohorts = [

        {
            name: "React Bootcamp",
            status: "ongoing",
            coach: "Rahul Sharma",
            trainer: "Amit Verma"
        },

        {
            name: "Java Full Stack",
            status: "completed",
            coach: "Priya Singh",
            trainer: "Ankit Jain"
        },

        {
            name: "Spring Boot",
            status: "ongoing",
            coach: "Neha Kapoor",
            trainer: "Rohit Gupta"
        },

        {
            name: "Microservices",
            status: "completed",
            coach: "Sakshi Patel",
            trainer: "Kunal Mehta"
        }

    ];

    return (

        <div>

            <h1>Academy Cohorts Dashboard</h1>

            {

                cohorts.map((cohort, index) => (

                    <CohortDetails

                        key={index}

                        name={cohort.name}

                        status={cohort.status}

                        coach={cohort.coach}

                        trainer={cohort.trainer}

                    />

                ))

            }

        </div>

    );

}

export default App;