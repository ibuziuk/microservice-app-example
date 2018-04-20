# Instructions for Che workspace creation with `microservice-app-example` on OpenShift

## Deploy Che on Opemshift 

As a first step you need to deploy Che on OpenShift. Instructions for deployment Che on Openshift can be found in the official Che [docs](https://www.eclipse.org/che/docs/openshift-single-user.html#openshift-container-platform)

Some notes:

- use `common` pvc strategy for in `CHE_INFRA_KUBERNETES_PVC_STRATEGY` env var
- tune workspace creation to be in the same namespace where che-server is deployed e.g. `CHE_INFRA_OPENSHIFT_PROJECT` (namespace where workspaces are created) should be the same as `CHE_OPENSHIFT_PROJECT` (namespace where che is deployed)

## Stack for `microservice-app-example`

In order to create workspace you need to first create a stack for it.

## Known Issues

