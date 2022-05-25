# PVWeb_cd_repo - a project to create CD infrastructure for any web app

hosts.inv - Inventory file;
ansible.cfg - Ansible config file;

nginx_run.yml - Install and start docker container with Nginx balancier web apps;
web_run.yml - Install and start multiple (count by var) docker containers with webapp image (flask for example);
curl_yml - Test a multiple webapps, created by web_run.yml
global_run.yml - Run playbook. It needs to send swarm token between master and node hosts

