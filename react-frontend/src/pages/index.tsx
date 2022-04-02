import { stringify } from 'querystring'
import React from 'react'
import ServiceWrapper from '../components/ServiceWrapper'

const Home = () => {
  const [firstname, setFirstname] = React.useState('Sunghyun')
  const [lastname, setLastname] = React.useState('Cho')
  const [result, setResult] = React.useState('Empty')

  return (
    <ServiceWrapper>
      <h1>React + Java</h1>
      <h2>Lookup User with Last name</h2>
      <input
        type="text"
        placeholder="Last Name"
        value={lastname}
        onChange={(e) => setLastname(e.target.value)}
      />
      <button
        onClick={() =>
          requestBackendWithQuerystrings('lookupwithlastname', {
            lastname,
          }).then((data) => {
            setResult(data)
          })
        }
      >
        Lookup User
      </button>
      <h2>Result</h2>
      <pre>{result}</pre>
    </ServiceWrapper>
  )
}

const requestBackendWithQuerystrings = async (
  pathname: RequestInfo,
  query: Record<string, string>
) => {
  const path =
    'http://localhost:8080/java-backend/' + pathname + '?' + stringify(query)
  console.log('Requesting: ' + path)
  const response = await fetch(path, {
    method: 'GET',
    mode: 'cors',
    headers: {
      'Access-Control-Allow-Origin': '*',
      'Content-Type': 'application/json',
    },
  })
  const data = await response.json()
  return data
}

export default Home
