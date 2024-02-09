FROM node:20-alpine AS build
RUN npm i -g @angular/cli
WORKDIR /app
COPY package*.json ./
RUN npm install
COPY . .
RUN npm run build -- --output-path=./dist/out --configuration $configuration
FROM nginx:latest
COPY nginx.conf /etc/nginx/conf.d/default.conf
COPY --from=build /app/dist/out/ /usr/share/nginx/html
#COPY --from=build /nginx.conf /etc/nginx/conf.d/default.conf
EXPOSE 4200
# CMD ng serve --host 0.0.0.0
