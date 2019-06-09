'use strict';

// tag::vars[]
const React = require('react');
const ReactDOM = require('react-dom');
// end::vars[]

// tag::app[]
//class App extends React.Component {

//}
// end::app[]

function Hello(){
    //return <div>Hello World!!</div>;
    return React.createElement('div', null, 'hello world!!!')
}

ReactDOM.render(
    //<Hello />, document.getElementById('mountNode'),
    React.createElement(Hello, null), document.getElementById('react'),
);