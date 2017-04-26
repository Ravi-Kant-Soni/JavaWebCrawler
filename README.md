# Java Web Crawler

A web crawler (also known as a web spider or web robot) is a program or automated script which browses the World Wide Web in a methodical, automated manner. This process is called Web crawling or spidering. Many legitimate sites, in particular search engines, use spidering as a means of providing up-to-date data.

## Task

Write a simple web crawler in a language of your choice in a couple of hours.
The crawler should:
- be limited to one domain. Given a starting URL – say http://wiprodigital.com
- it should visit all pages within the domain, but not follow the links to external sites such as Google or Twitter or linkedIn.

The output should be a simple structured site map (this does not need to be a traditional XML sitemap - just some sort of output to reflect what your crawler has discovered), showing links to other pages under the same domain, links to external URLs and links to static content such as images for each respective page.

We would like to see:
- README.md file that explains how to run / build your solution
- make your solution available on Github and forward the link
- Explanation of what could be done with more time
- Project builds / runs / tests as per instruction

## Description
This project is using **jsoup** internally to crawl pages.

## How to build:

To build run the bellow command on the project's root directory

	mvn clean install

## How to Run

## Test the service

- visit http://localhost:8080/webcrawler, this will call restController. And start processing Crawler.
- Visit http://localhost:8080/h2-console, select database 'jdbc:h2:mem:webCrawlerDB' and execute 'select * from crawler'

## TODO

* write UNIT test
* Add comments for each functions
* Sort the O/P in structured site map
* Refactor for code improvement

## Authors

* **Ravi Kant Soni** - *Author of 'Learning Spring Application Development*
