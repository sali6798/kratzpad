var path = require('path');

module.exports = {
    entry: './src/main/js/app.js',
    devtool: 'sourcemaps',
    cache: true,
    output: {
        path: __dirname,
        filename: './src/main/resources/static/built/bundle.js'
    },
  module: {
    rules: [{
      test: /\.js$/, // include .js files
      enforce: 'pre', // preload the jshint loader
      exclude: /node_modules/, // exclude any and all files in the node_modules folder
      use: 'babel-loader'
    }]
  },
};