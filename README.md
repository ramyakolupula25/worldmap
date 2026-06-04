# worldmap
worldmap
# World Info App

A cloud-native DevOps project demonstrating:

- React Frontend
- Spring Boot Backend
- Docker
- Kubernetes
- Helm
- ArgoCD
- Terraform
- AWS EKS
- GitHub Actions
- Prometheus
- Grafana

## Local Run

### Backend

```bash
cd backend
mvn spring-boot:run
```

### Frontend

```bash
cd frontend
npm install
npm run dev
```

## Docker

```bash
docker-compose up -d
```

## Terraform

```bash
cd terraform/eks-infra/root-module

terraform init

terraform plan

terraform apply
```

## Helm

```bash
helm install backend ./helm/backend

helm install frontend ./helm/frontend
```

## ArgoCD

```bash
kubectl apply -f argocd/project.yaml

kubectl apply -f argocd/backend-app.yaml

kubectl apply -f argocd/frontend-app.yaml
```

## Monitoring

```bash
helm install prometheus prometheus-community/kube-prometheus-stack

helm install grafana grafana/grafana
```


This gives you a complete portfolio project structure with:

Terraform EKS
React frontend
Spring Boot backend
Docker
Helm
ArgoCD
GitHub Actions
Prometheus
Grafana