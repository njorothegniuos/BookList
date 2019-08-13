# BookList
Book list project for Spring Boot deployed to kubernetes
--deployment we use Google Cloud SDK installed locally to push our docker image we build to Google Cloud 
 Step one:
i.) tag our image with the important information that Google Cloud requires.Issue command: docker tag booklist gcr.io/<PROJECT NAME>/myimage:v1
ii.) Push the image.Issue command: gcloud docker -- push gcr.io/<PROJECT NAME>/myimage:v1
iii.)Serve our docker image in Kubernetes Engine:Head to google cloud account dashboard:
  create a cluster->on workloads section, hit the Deploy button-> ensure to click Select existing Google Container Registry image and choose your repo -> Look for the option Expose image to internet->You will get an endpoint whic you can test the deployment.
  
 Step two:
 i.)using the yaml file(deploment.yaml)
