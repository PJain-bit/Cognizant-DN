import officeImg from "./office.jpg";

function App() {

  const office = {
    Name: "Skyline Business Park",
    Rent: 55000,
    Address: "MP Nagar, Bhopal"
  };

  const officeList = [
    {
      Name: "Skyline Business Park",
      Rent: 55000,
      Address: "MP Nagar, Bhopal"
    },
    {
      Name: "Corporate Hub",
      Rent: 75000,
      Address: "Vijay Nagar, Indore"
    },
    {
      Name: "Tech Tower",
      Rent: 62000,
      Address: "Electronic City, Bangalore"
    }
  ];

  return (
    <div style={{ margin: "20px" }}>

      <h1>Office Space Rental App</h1>

      <img
        src={officeImg}
        alt="Office Space"
        width="350"
        height="220"
      />

      <h2>Featured Office</h2>

      <p><b>Name:</b> {office.Name}</p>

      <p
        style={{
          color: office.Rent < 60000 ? "red" : "green",
          fontWeight: "bold"
        }}
      >
        Rent: ₹{office.Rent}
      </p>

      <p><b>Address:</b> {office.Address}</p>

      <hr />

      <h2>Available Office Spaces</h2>

      {
        officeList.map((item, index) => (

          <div key={index} style={{ marginBottom: "20px" }}>

            <img
              src={officeImg}
              alt="Office"
              width="300"
            />

            <h3>{item.Name}</h3>

            <p
              style={{
                color: item.Rent < 60000 ? "red" : "green",
                fontWeight: "bold"
              }}
            >
              Rent : ₹{item.Rent}
            </p>

            <p>Address : {item.Address}</p>

            <hr />

          </div>

        ))
      }

    </div>
  );
}

export default App;