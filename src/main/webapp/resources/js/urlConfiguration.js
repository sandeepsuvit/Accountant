// Global base URL
var accontant_base_url;

// Get the URL protocol
var url_protocol = window.location.protocol;

// Get the host URL
var host_url = window.location.host;

// Local development URL | Only for development purpose
var local_dev_url = "http://localhost:8080";

// Check if the host URL is from the local development system
if (host_url.indexOf("localhost") >= 0) {
	// Only for development purpose
	accontant_base_url = local_dev_url + "/Accountant/";
} else {
	// Actual web URL
	accontant_base_url = url_protocol + "://" + host_url + "/";
}