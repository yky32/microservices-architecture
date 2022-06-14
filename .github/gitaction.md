## Git Action Env variable
`https://docs.github.com/en/actions/learn-github-actions/contexts`

## Git Action - Maven settings.xml
- https://github.com/marketplace/actions/generate-settings-xml-for-maven-builds
```yaml
- name: Set up ~.m2/settings.xml
  uses: whelk-io/maven-settings-xml-action@v20
  with:
    active_profiles: >
      ["github"]
    repositories: >
      [
        {
          "id": "central",
          "url": "https://repo1.maven.org/maven2"
        },
        {
          "id": "github",
          "url": "https://maven.pkg.github.com/yky32/together-parent",
          "snapshots": {
            "enabled": "true"
          }
        }
      ]
    servers: '[
          { "id": "github", "username": "yky32", "password": "${{ secrets.MAVEN_GITHUB_TOKEN }}" },
          { "id": "docker.io", "username": "${{ secrets.DOCKER_USERNAME }}", "password": "${{ secrets.DOCKER_PASSWORD }}" }
        ]'

- name: 'Create settings.xml'
  run: |
    touch ~/.m2/settings.xml
    echo '<settings><servers><server><id>github</id><username>${{ secrets.GITHUB_USERNAME }}</username><password>${{ secrets.GITHUB_PASSWORD }}</password></server></servers></settings>' > ~/.m2/settings.xml
```