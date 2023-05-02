# Métricas y actuator

## Uso de métricas (micromiter)
Es posible crear métricas propias para analizar el funcionamiento de la aplicación utilizando micromiter, para ello usaremos la anotación @Timed(value=""). Una vez definida la anotación @Timed, las métricas de uso del endpoint serán expuestas en /actuator/metrics.

## Prometheus
Nos permite monitorizar diversas métricas. Frecuentemente se almacenan el uso de CPU o de memoria, el número de conexiones, el número de peticiones o la cantidad de sesiones activas en un servidor. 

## Grafana
Usamos Grafana para poder visualizar datos mediante gráficos.

## Prometheus con Grafana

1. mvn clean install
2. docker-compose up -d
3. En Grafana podemos añadir Prometheus como fuente de datos --> Home > Administration > Data sources > Add data source, seleccionar prometheus
4. Crear dashboard en Grafana para ver gráficos --> Home > Dashboards > New dashboard

### Ejemplo queries en Prometheus
https://prometheus.io/docs/prometheus/latest/querying/examples/



