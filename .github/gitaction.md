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

# Github Context Env
- https://docs.github.com/en/actions/learn-github-actions/contexts#github-context
```json
{
  "token": "***",
  "job": "dump_contexts_to_log",
  "ref": "refs/heads/my_branch",
  "sha": "c27d339ee6075c1f744c5d4b200f7901aad2c369",
  "repository": "octocat/hello-world",
  "repository_owner": "octocat",
  "repositoryUrl": "git://github.com/octocat/hello-world.git",
  "run_id": "1536140711",
  "run_number": "314",
  "retention_days": "90",
  "run_attempt": "1",
  "actor": "octocat",
  "workflow": "Context testing",
  "head_ref": "",
  "base_ref": "",
  "event_name": "push",
  "event": {
    ...
  },
  "server_url": "https://github.com",
  "api_url": "https://api.github.com",
  "graphql_url": "https://api.github.com/graphql",
  "ref_name": "my_branch",
  "ref_protected": false,
  "ref_type": "branch",
  "secret_source": "Actions",
  "workspace": "/home/runner/work/hello-world/hello-world",
  "action": "github_step",
  "event_path": "/home/runner/work/_temp/_github_workflow/event.json",
  "action_repository": "",
  "action_ref": "",
  "path": "/home/runner/work/_temp/_runner_file_commands/add_path_b037e7b5-1c88-48e2-bf78-eaaab5e02602",
  "env": "/home/runner/work/_temp/_runner_file_commands/set_env_b037e7b5-1c88-48e2-bf78-eaaab5e02602"
}
```