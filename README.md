# Micrometer + Prometheus + Grafana Demo

This is a simple Spring Boot 3 application that exposes custom metrics using Micrometer and Prometheus. It includes:

- A custom counter metric (`custom_requests_total`)
- Integration with Prometheus
- A local Grafana dashboard (via Docker Compose)

---

## 🧱 Tech Stack

- Java 21
- Spring Boot 3
- Micrometer
- Prometheus
- Grafana
- Docker + Docker Compose

---

## 🚀 How to Run the Project

### 1. Clone the repo

```bash
git clone git@github.com:gr1zper/micrometer-prometheus-app.git
cd micrometer-prometheus-app
```

### 2. Run Spring app

```bash
gradle bootRun
```
By default, it starts at:
http://localhost:8080

### 3. Start Prometheus & Grafana

```bash
docker compose up
```

This will start:
•	Prometheus on http://localhost:9090
•	Grafana on http://localhost:3000

Default Grafana login:
Username: admin
Password: admin

### 4. Verify the Micrometer metrics

Visit:
http://localhost:8080/actuator/prometheus
You should see Prometheus-formatted metrics, including:
custom_requests_total 5.0
Each request will increase custom_requests_total

###  5. Import Grafana Dashboard (Optional)

In Grafana:
1.	Go to Dashboards → New → Import
2.	Paste example dashboard JSON (or use Prometheus default templates)
3.	Select your Prometheus data source


### 6. Shut everything down

```bash
docker compose down
```