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

## How to Run

This is a sample Java / Maven / Spring Boot application. This application is packaged as a war which has Tomcat 8 embedded. No Tomcat or JBoss installation is necessary. You run it using the java -jar command.
- Clone this repository
- Make sure you are using JDK 1.8 and Maven 3.x
- You can **build** the project and run the tests by running 
	mvn clean package
- Once successfully built, you can run the service by
	mvn spring-boot:run
- Check the stdout to make sure no exceptions are thrown

Once the application runs you should see something like this

```
	2017-04-27 02:21:44.289[0;39m [32m INFO[0;39m [35m47884[0;39m [2m---[0;39m [2m[           main][0;39m [36ms.b.c.e.t.TomcatEmbeddedServletContainer[0;39m [2m:[0;39m Tomcat started on port(s): 8080 (http)
[2m2017-04-27 02:21:44.304[0;39m [32m INFO[0;39m [35m47884[0;39m [2m---[0;39m [2m[           main][0;39m [36mc.r.w.JavaWebCrawlerApplication         [0;39m [2m:[0;39m Started JavaWebCrawlerApplication in 12.083 seconds (JVM running for 13.149)
[2m
```

## Test the service

- visit below link, this will call restController. And start processing Crawler.
	http://localhost:8080/webcrawler, 

- Visit below link for embeded h2 database, and select database **jdbc:h2:mem:webCrawlerDB** and execute 
	http://localhost:8080/h2-console
	'select * from crawler'

## TODO

* write UNIT test
* Add comments for each functions
* Sort the O/P in structured site map
* Refactor for code improvement

## Authors

* **Ravi Kant Soni** - *Author of 'Learning Spring Application Development*
