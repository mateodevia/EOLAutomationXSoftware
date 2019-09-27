var mockaroo = require('mockaroo');
var fs = require('fs');
var json2xls = require('json2xls');

var client = new mockaroo.Client({
    apiKey: 'c1527490'
});

var country = client.generate({
	count: 5,
	format: 'json',
	header: true,
	fields: [
	{
		name: 'id',
		type: 'Row Number'
	},
	{
		name: 'shortName',
		type: 'Country Code'
	},
	{
		name: 'name',
		type: 'Country'
	},
	{
		name: 'phone',
		type: 'Phone'
	},
	{
		name: 'capital',
		type: 'City'
	}		]
});

country.then(function (country_response) {
    var countryxls = json2xls(country_response);
    fs.writeFileSync('./data/countrys.xlsx', countryxls, 'binary');
});

var student = client.generate({
	count: 5,
	format: 'json',
	header: true,
	fields: [
	{
		name: 'id',
		type: 'Row Number'
	},
	{
		name: 'first_name',
		type: 'First Name'
	},
	{
		name: 'last_name',
		type: 'Last Name'
	},
	{
		name: 'gender',
		type: 'Gender'
	},
	{
		name: 'country',
		type: 'Country'
	},
	{
		name: 'city',
		type: 'City'
	}		]
});

student.then(function (student_response) {
    var studentxls = json2xls(student_response);
    fs.writeFileSync('./data/students.xlsx', studentxls, 'binary');
});

