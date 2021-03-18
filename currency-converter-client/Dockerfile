# Stage 1 - Create production build 
FROM node:12.7-alpine AS Build
LABEL MAINTAINER="amit.fegade@citiustech.com" \
          version="1.0"  \
          description="Currency Conversion App"
WORKDIR /usr/src/app
COPY package.json .
RUN npm install
COPY . .
RUN npm run build

# Stage 2 - Deploy production build of angular application to nginx server.
FROM  nginx:1.17.1-alpine
COPY default.conf  /etc/nginx/conf.d/default.conf
COPY  --from=Build  /usr/src/app/dist/currency-converter-client  /usr/share/nginx/html
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]