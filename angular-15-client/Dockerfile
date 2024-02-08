FROM node:20-alpine AS build
RUN npm i -g @angular/cli
WORKDIR /app
COPY package*.json ./
RUN npm install
COPY . .
RUN npm run build
EXPOSE 4200
CMD ng serve --host 0.0.0.0