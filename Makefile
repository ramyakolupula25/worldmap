build:
	docker-compose build

up:
	docker-compose up -d

down:
	docker-compose down

backend:
	cd backend && mvn clean package

frontend:
	cd frontend && npm install && npm run build

deploy-backend:
	helm upgrade --install backend ./helm/backend

deploy-frontend:
	helm upgrade --install frontend ./helm/frontend

destroy:
	kubectl delete all --alll