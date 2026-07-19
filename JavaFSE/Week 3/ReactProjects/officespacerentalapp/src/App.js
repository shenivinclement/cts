import officeImage from './office.jpg'; // remove this line if using a URL instead

function App() {
  // A single office object
  const office = {
    name: "Cognizant Business Park",
    rent: 55000,
    address: "MG Road, Bangalore"
  };

  // A list of office objects to loop through
  const officeList = [
    { name: "Cognizant Business Park", rent: 55000, address: "MG Road, Bangalore" },
    { name: "Tech Tower", rent: 75000, address: "Whitefield, Bangalore" },
    { name: "Green Valley Offices", rent: 48000, address: "Hitech City, Hyderabad" },
    { name: "Skyline Business Center", rent: 62000, address: "Gachibowli, Hyderabad" },
    { name: "Metro Corporate Hub", rent: 90000, address: "Andheri, Mumbai" }
  ];

  return (
      <div>
        {/* JSX element for the heading */}
        <h1>Office Space Rental</h1>

        {/* JSX attribute displaying an image */}
        <img src={officeImage} alt="Office Space" width="300" />
        {/* If using a URL instead of a local file, replace the line above with:
                <img src="https://via.placeholder.com/300x200?text=Office+Space" alt="Office Space" width="300" /> */}

        {/* Displaying a single office object's details */}
        <h2>Featured Office</h2>
        <p>Name: {office.name}</p>
        <p>
          Rent: <span style={{ color: office.rent < 60000 ? 'red' : 'green' }}>
                    {office.rent}
                </span>
        </p>
        <p>Address: {office.address}</p>

        {/* Looping through a list of office objects */}
        <h2>All Available Offices</h2>
        {officeList.map((item, index) => (
            <div key={index} style={{ marginBottom: '10px' }}>
              <p>Name: {item.name}</p>
              <p>
                Rent: <span style={{ color: item.rent < 60000 ? 'red' : 'green' }}>
                            {item.rent}
                        </span>
              </p>
              <p>Address: {item.address}</p>
              <hr />
            </div>
        ))}
      </div>
  );
}

export default App;