function CountryCard({ country }) {
  return (
    <div className="card">
      <img
        src={country.flags?.png}
        alt={country.name?.common}
      />

      <h2>{country.name?.common}</h2>

      <p>
        <strong>Capital:</strong>{" "}
        {country.capital?.[0] || "N/A"}
      </p>

      <p>
        <strong>Region:</strong>{" "}
        {country.region}
      </p>

      <p>
        <strong>Population:</strong>{" "}
        {country.population?.toLocaleString()}
      </p>
    </div>
  );
}

export default CountryCard;