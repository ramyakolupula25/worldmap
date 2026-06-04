import { useEffect, useState } from "react";

import Header from "./components/Header";
import SearchBar from "./components/SearchBar";
import CountryCard from "./components/CountryCard";

import { getCountries } from "./services/api";

function App() {
  const [countries, setCountries] = useState([]);
  const [search, setSearch] = useState("");

  useEffect(() => {
    fetchCountries();
  }, []);

  const fetchCountries = async () => {
    try {
      const data = await getCountries();
      setCountries(data);
    } catch (error) {
      console.error(error);
    }
  };

  const filteredCountries = countries.filter((country) =>
    country.name?.common
      ?.toLowerCase()
      .includes(search.toLowerCase())
  );

  return (
    <div>
      <Header />

      <SearchBar
        search={search}
        setSearch={setSearch}
      />

      <div className="container">
        {filteredCountries.map((country) => (
          <CountryCard
            key={country.cca3}
            country={country}
          />
        ))}
      </div>
    </div>
  );
}

export default App;