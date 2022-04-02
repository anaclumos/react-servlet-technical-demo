import React from 'react'
import styled from 'styled-components'

const ServiceWrapper: React.FC = ({ children }) => {
  return (
    <Layout>
      <ContentWrapper>{children}</ContentWrapper>
    </Layout>
  )
}

export default ServiceWrapper

const Layout = styled.main`
  height: 100%;
  max-width: 600px;
  word-break: break-all;
  word-wrap: break-word;
  margin: auto;
  display: flex;
  justify-content: center;
  background-color: #ffffff;
`

const ContentWrapper = styled.div`
  flex: 1;
  display: flex;
  flex-direction: column;
`
