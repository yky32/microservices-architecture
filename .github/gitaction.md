## Git Action Env variable
`https://docs.github.com/en/actions/learn-github-actions/contexts`

## Git Action - Maven settings.xml
```yaml
- name: maven-settings-xml-action
  uses: whelk-io/maven-settings-xml-action@v20
  with:
    repositories: '[{ "id": "some-repository", "url": "http://some.repository.url" }]'
    plugin_repositories: '[{ "id": "some-plugin-repository", "url": "http://some.plugin.repository.url" }]'
    servers: '[{ "id": "some-server", "username": "some.user", "password": "some.password" }]'

- name: 'Create settings.xml'
  run: |
    touch ~/.m2/settings.xml
    echo '<settings><servers><server><id>github</id><username>${{ secrets.GITHUB_USERNAME }}</username><password>${{ secrets.GITHUB_PASSWORD }}</password></server></servers></settings>' > ~/.m2/settings.xml
```