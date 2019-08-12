# BookList
Book list project for Spring Boot deployed to kubernetes
--in this deployment we use Google Cloud SDK installed locally to push our docker image we build to Google Cloud
i.) tag our image with the necessary information that Google Cloud needs: docker tag booklist gcr.io/<PROJECT NAME>/myimage:v1
ii.) Push the image: gcloud docker -- push gcr.io/<PROJECT NAME>/myimage:v1
iii.)Serve our docker image in Kubernetes Engine:
  create a cluster->on workloads section, hit the Deploy button-> ensure to click Select existing Google Container Registry image and choose your repo -> Look for the option Expose image to internet->You will get an endpoint whic you can test the deployment.
