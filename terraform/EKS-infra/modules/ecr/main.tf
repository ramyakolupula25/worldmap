resource "aws_ecr_repository" "frontend" {
  name = "world-info-frontend"

  image_scanning_configuration {
    scan_on_push = true
  }
}

resource "aws_ecr_repository" "backend" {
  name = "world-info-backend"

  image_scanning_configuration {
    scan_on_push = true
  }
}