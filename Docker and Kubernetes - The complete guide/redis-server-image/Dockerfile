# Usare un'immagine esistente come base
FROM alpine

# Scaricare e installare una dipendenza
RUN apk add --update redis

# Dire all'immagine cosa fare al suo avvio come container
CMD ["redis-server"]
