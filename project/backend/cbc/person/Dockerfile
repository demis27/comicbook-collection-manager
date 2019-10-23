FROM oracle/graalvm-ce:19.2.0.1 as graalvm
COPY . /home/app/person
WORKDIR /home/app/person
RUN gu install native-image
RUN native-image --no-server -cp target/person-*.jar

FROM frolvlad/alpine-glibc
EXPOSE 8080
COPY --from=graalvm /home/app/person .
ENTRYPOINT ["./person"]
