FROM node:16.16.0-alpine
WORKDIR /app

ENV NODE_ENV production

# os 사용자 추가 # 추후 수정
RUN addgroup -g 1001 -S nodejs
RUN adduser -S nextjs -u 1001

# builder 에서 복사해야할 파일이 있다면 추가하면 된다. 
COPY next.config.js ./
COPY ./public ./public
COPY ./.next ./.next
COPY ./node_modules ./node_modules
COPY ./package.json ./package.json

# 추후 수정
USER nextjs

# 외부 포트 사용한다는 알림 없어도 상관없음
EXPOSE 3000

ENV PORT 3000

CMD ["node_modules/.bin/next", "start"]